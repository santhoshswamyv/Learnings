package javaassignment10.question2;

public class StreamingPlayer implements Playable {

	@Override
	public void play() {
		System.out.println("StreamingPlayer Plays");
	}

	@Override
	public void pause() {
		System.out.println("StreamingPlayer Paused");
	}

	@Override
	public void stop() {
		System.out.println("StreamingPlayer Stops");
	}

}
