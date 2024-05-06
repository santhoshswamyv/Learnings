package javaassignment14.simplefiledownload;

import java.util.Scanner;

public class FileDownloader {
	static Scanner sc = new Scanner(System.in);

// Example Download Link
//https://cartographicperspectives.org/index.php/journal/article/download/cp43-complete-issue/pdf/2712

	public static void main(String[] args) {
		Downloader downloader = new Downloader();
		System.out.println("Thread Assignment\n");
		exit: while (true) {
			System.out.println("1) Download File \n2) Stop Download \n3) Exit");
			String option = sc.next();
			switch (option) {
			case "1":
				System.out.print("Enter the URL :- ");
				String url = sc.next();
				System.out.print("Enter the File Name with Extension :-");
				String fileName = sc.next();
				downloader.setFileUrl(url);
				downloader.setFileName(fileName);
				downloader.start();
				break;
			case "2":
				downloader.setStopDownload(true);
				return;
			case "3":
				break exit;
			default:
				System.err.println("Choose Valid Option..!");
				break;
			}
		}
	}
}
