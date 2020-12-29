package org.ReadnWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Reader {

	private List<String> mine;
	private List<String> achievements;
	private List<String> whatIDontHave;

	public Reader() {
		super();
		this.mine = new ArrayList<String>();
		this.achievements = new ArrayList<String>();
		this.whatIDontHave = new ArrayList<String>();
	}

	public void readerForMe() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(
					new FileReader("FILE PATH"));
			String line = reader.readLine();
			int counter = 0;
			while (line != null) {
				this.mine.add(line);
				System.out.println(line);
				counter++;
				line = reader.readLine();
			}
			reader.close();
			System.out.println("The counter is :" + counter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readerForAllAch() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(
					new FileReader("FILE PATH"));
			String line = reader.readLine();
			int counter = 0;
			while (line != null) {
				this.achievements.add(line);
				System.out.println(line);
				line = reader.readLine();
				counter++;
			}
			reader.close();
			System.out.println("The counter is :" + counter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void matcher() {
		Set<String> set1 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		set1.addAll(this.achievements);
		Set<String> set2 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		set2.addAll(this.mine);
		set1.removeAll(set2);
		this.achievements.retainAll(set1);
		this.whatIDontHave.addAll(set1);
	}

	public void addAchievement(String x) {
		this.mine.add(x);
		this.whatIDontHave.remove(x);
	}

	public void writer() {
		this.matcher();
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("filePath"));
			int counter = 0;
			while (counter < this.whatIDontHave.size()) {
				writer.append(this.whatIDontHave.get(counter) + "\n");
				counter++;
			}
			writer.append("LEFT: " + counter);
			writer.close();

			// writer for Fallout4AchieveMentsIhave.txt
			BufferedWriter writer2 = new BufferedWriter(
					new FileWriter("filePath"));
			int counter2 = 0;
			while (counter2 < this.mine.size()) {
				writer2.append(this.mine.get(counter2) + "\n");
				counter2++;
			}
			writer2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<String> getMine() {
		return mine;
	}

	public List<String> getAchievements() {
		return achievements;
	}

	public List<String> getWhatIDontHave() {
		return whatIDontHave;
	}

	public static void main(String[] args) {
		Reader read = new Reader();

		/**
		 * if have completed an achievement place it your lines of code under this
		 * comment eg. read.addAchievement("Nuclear Family");
		 * read.addAchievement("Docile");
		 */
		read.readerForMe();
		
		read.readerForAllAch();

		read.writer();
	}

}
