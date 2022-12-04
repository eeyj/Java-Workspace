package com.kh.practice.score.model.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScoreDAO {

	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("myFile.txt", true)))) {
			dos.writeBytes(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public DataInputStream readScore() throws FileNotFoundException {
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("myFile.txt")));
		return dis;
	}

}