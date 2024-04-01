package javaassignment10.question2;

import java.util.Scanner;

public class PlayableDriver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean b = true;
		while (b) {
			System.err.println("Choose one of the Player\n\n1) MP3Player \n2) CDPlayer \n3) StreamingPlayer \n4) Exit");
			boolean play = false;
			boolean pause = false;
			boolean stop = true;
			int option = sc.nextInt();
			switch (option) {
			case 1:
				Playable mp = new MP3Player();
				boolean m = true;
				while (m) {
					System.err.println("MP3 Player Selected : \n\n1) Play \n2) Pause \n3) Stop \n4) Exit");
					option = sc.nextInt();
					switch (option) {
					case 1:
						if (!play) {
							mp.play();
							play = true;
							pause = false;
							stop = false;
						} else {
							System.out.println("MP3 Player already Playing Songs..!");
						}
						break;
					case 2:
						if (play && !pause) {
							mp.pause();
							play = false;
							pause = true;
						} else {
							System.out.println("MP3 Player is not Playing..!");
						}
						break;
					case 3:
						if (!stop) {
							mp.stop();
							stop = true;
							play = false;
							pause = false;
						} else {
							System.out.println("MP3 Player is not Playing..!");
						}
						break;
					case 4:
						play = false;
						pause = false;
						stop = true;
						m = false;
						break;
					default:
						System.err.println("Choose valid Option..!");
						break;
					}
				}
				break;
			case 2:
				Playable cp = new CDPlayer();
				m = true;
				while (m) {
					System.err.println("CD Player Selected : \n\n1) Play \n2) Pause \n3) Stop \n4) Exit");
					option = sc.nextInt();
					switch (option) {
					case 1:
						if (!play) {
							cp.play();
							play = true;
							pause = false;
							stop = false;
						} else {
							System.out.println("CD Player already Playing Songs..!");
						}
						break;
					case 2:
						if (play && !pause) {
							cp.pause();
							play = false;
							pause = true;
						} else {
							System.out.println("CD Player is not Playing..!");
						}
						break;
					case 3:
						if (!stop) {
							cp.stop();
							stop = true;
							play = false;
							pause = false;
						} else {
							System.out.println("CD Player is not Playing..!");
						}
						break;
					case 4:
						m = false;
						break;
					default:
						System.err.println("Choose valid Option..!");
						break;
					}
				}
				break;
			case 3:
				Playable sp = new StreamingPlayer();

				m = true;
				while (m) {
					System.err.println("Streaming Player Selected : \n\n1) Play \n2) Pause \n3) Stop \n4) Exit");
					option = sc.nextInt();
					switch (option) {
					case 1:
						if (!play) {
							sp.play();
							play = true;
							pause = false;
							stop = false;
						} else {
							System.out.println("Streaming Player already Playing Songs..!");
						}
						break;
					case 2:
						if (play && !pause) {
							sp.pause();
							play = false;
							pause = true;
						} else {
							System.out.println("Streaming Player is not Playing..!");
						}
						break;
					case 3:
						if (!stop) {
							sp.stop();
							stop = true;
							play = false;
							pause = false;
						} else {
							System.out.println("Streaming Player is not Playing..!");
						}
						break;
					case 4:
						play = false;
						pause = false;
						stop = true;
						m = false;
						break;
					default:
						System.err.println("Choose valid Option..!");
						break;
					}
				}
				break;
			case 4:
				b = false;
				break;
			default:
				System.err.println("Choose valid Option..!");
				break;
			}
		}
	}
}