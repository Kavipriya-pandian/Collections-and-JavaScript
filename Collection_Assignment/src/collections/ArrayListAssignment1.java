package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Participant {
	private String participantName;
	private String participantTalent;
	private double participantScore;

	public Participant(String participantName, String participantTalent, double participantScore) {
		this.participantName = participantName;
		this.participantTalent = participantTalent;
		this.participantScore = participantScore;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public String getParticipantTalent() {
		return participantTalent;
	}

	public void setParticipantTalent(String participantTalent) {
		this.participantTalent = participantTalent;
	}

	public double getParticipantScore() {
		return participantScore;
	}

	public void setParticipantScore(double participantScore) {
		this.participantScore = participantScore;
	}
	
	@Override
	public String toString() {
		return "Participant Name: "+getParticipantName()+", Participant Talent: "+getParticipantTalent()+", Participant Score: "+getParticipantScore();
	} 

}


public class ArrayListAssignment1 {


	

		public static List<Participant> generateListOfFinalists(Participant[] finalists) {
//			// Implement your logic here and change the return statement accordingly
//			Store the details of finalists in an ArrayList and return the 
//			
	        List<Participant> finalistList = new ArrayList<>();
	        for (Participant finalist : finalists) {
	            finalistList.add(finalist);
	        }
	        return finalistList;

		}

		public static List<Participant> getFinalistsByTalent(List<Participant> finalists, String talent) {
			// Implement your logic here and change the return statement accordingly
			
//			Return the details of all the finalists for the given 'talent' in an 
//			ArrayList.


	        List<Participant> newList = new ArrayList<>();
	        for (Participant finalist : finalists) {
	            if (finalist.getParticipantTalent().equals(talent)) {
	                newList.add(finalist);
	            }
	        }
	        return newList;

		}

		public static void main(String[] args) {
			Participant finalist1 = new Participant("Hazel", "Singing", 91.2);
			Participant finalist2 = new Participant("Ben", "Instrumental", 95.7);
			Participant finalist3 = new Participant("John", "Singing", 94.5);
			Participant finalist4 = new Participant("Bravo", "Singing", 97.6);

			Participant[] finalists = { finalist1, finalist2, finalist3, finalist4 };

			List<Participant> finalistsList = generateListOfFinalists(finalists);

			System.out.println("Finalists");
			for (Participant finalist : finalistsList)
				System.out.println(finalist);

			String talent = "Singing";
			System.out.println("Finalists in " + talent + " category");

			List<Participant> finalistsCategoryList = getFinalistsByTalent(finalistsList, talent);
			for (Participant finalist : finalistsCategoryList)
				System.out.println(finalist);
		}

	}

