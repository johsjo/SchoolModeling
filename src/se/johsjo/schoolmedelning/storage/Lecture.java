package se.johsjo.schoolmedelning.storage;

public final class Lecture {
	private int lectureId, lectureLength;
	private String topic;

	public Lecture(int lectureId, int lectureLength, String topic) {
		this.lectureId = lectureId;
		this.lectureLength = lectureLength;
		this.topic = topic;
	}

	public int getLectureId() { return lectureId; }
	public int getLectureLength() { return lectureLength; }
	public String getTopic() { return topic; }
}
