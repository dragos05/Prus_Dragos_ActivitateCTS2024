package main;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

import clase.Aplicant;

import reader.AplicantReader;
import reader.AngajatReader;

public class Program {
	public Program() {
	}

	public static void main(String[] args) {
		try {
			AplicantReader angajatReader = new AngajatReader();
			List<Aplicant> listaAngajati = angajatReader.read("angajati.txt");
			Iterator var3 = listaAngajati.iterator();

			while(var3.hasNext()) {
				Aplicant angajat = (Aplicant)var3.next();
				System.out.println(angajat.toString());
			}
		} catch (FileNotFoundException var5) {
			var5.printStackTrace();
		}

	}
}