package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class project {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Você quer: 1- inserir um nome no arquivo, 2- exibir todos os nomes, 3- apagar todo o arquivo");
		int r=sc.nextInt();
		//bw
		sc.nextLine();
		String caminho="C:\\temp\\arquivo.txt";
		//bf
		FileReader fr=null;
		BufferedReader br=null;
		if(r==1) {
			System.out.println("o que você quer digitar?");
			String frase= sc.nextLine();
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
				bw.write(frase);
				bw.newLine();
			}
		}
		else if(r==2) {
			fr=new FileReader(caminho);
			br=new BufferedReader(fr);
			String linha=br.readLine();

			while(linha!=null) {
				System.out.println(linha);
				linha=br.readLine();
			}
		}else { 
			File file = new File(caminho); 
			file.delete();
		}
		
		sc.close();

	}

}
