package javaassignment10.question2;

public class CDPlayer implements Playable {

	@Override
	public void play() {
		System.out.println("CDPlayer Plays");
	}

	@Override
	public void pause() {
		System.out.println("CDPlayer Paused");
	}

	@Override
	public void stop() {
		System.out.println("CDPlayer Stops");
	}

}
