package JavaStreamsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class FlateMap2 
{

	@Test
	public void sportsTeam()
	{
		List<String> teamA = Arrays.asList("Sachin","Ganguly","Kumble");
		List<String> teamB = Arrays.asList("Yuvaraj","Sehwag","Dhoni");
		List<String> teamC = Arrays.asList("Gavaskar","Azhar","Jadeja");
		
		List<List<String>> totalTeam = new ArrayList<List<String>>();
		totalTeam.add(teamA);
		totalTeam.add(teamB);
		totalTeam.add(teamC);
		
		// Before Java 8 using foreach loop
//		
//		for(List<String> finalTeam : totalTeam)
//		{
////			System.out.println(finalTeam);
//			for(String fnTeam:finalTeam)
//			{
//				System.out.println(" Final List sorted using Foreach Loop :"+fnTeam);
//			}
//		}
//		
		// Using using Streams Flat Map
		
		// Here Flat Map create each stream for each collections(teamA,teamB,teamC). So here there are 3 Streams.
		//https://www.youtube.com/watch?v=1gXFrh9PBic
		totalTeam.stream().flatMap(fList->fList.stream()).collect(Collectors.toList()).forEach(output->System.out.println(output));

	}

}
