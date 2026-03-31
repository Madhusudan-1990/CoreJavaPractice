package JavaStreamsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream 
{
	String studentName;
	int score;
	
	public ParallelStream(String studentName, int score)
	{
		this.studentName = studentName;
		this.score = score;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public int  getScore()
	{
		return score;
	}
	
	public static void main(String args[])
	{
		List<ParallelStream> studentList = Arrays.asList(
				new ParallelStream("ABC", 80),
				new ParallelStream("VNAS", 50),
				new ParallelStream("MDA", 85),
				new ParallelStream("KSK", 90),
				new ParallelStream("KSL", 40));
		
		// Normal Stream - Process objects sequentially
		// Filter 3 students who scored 80 and above
		studentList.stream().filter(score->score.getScore()>=80).limit(3).forEach(sys->System.out.println("Filter 3 students who scored 80 and above using Normal Streams "+sys.getStudentName()+" : " +sys.getScore()));
		
		// Parallel Stream - Process objects Parallely. This increases the performance
		// Filter 3 students who scored 80 and above
		studentList.parallelStream().filter(score->score.getScore()>=80).limit(3).forEach(sys->System.out.println("Filter 3 students who scored 80 and above using Parallel Streams"+sys.getStudentName()+" : " +sys.getScore()));
	}

}
