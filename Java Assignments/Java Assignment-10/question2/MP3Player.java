package javaassignment10.question2;

public class MP3Player implements Playable {

	@Override
	public void play() {
		System.out.println("MP3Player Plays");
	}

	@Override
	public void pause() {
		System.out.println("MP3Player Paused");
	}

	@Override
	public void stop() {
		System.out.println("MP3Player Stops");
	}

}
