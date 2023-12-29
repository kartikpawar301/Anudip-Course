package practice;

class Trainer{
	
	private int trainerId;
	private String trainerName;
	private String subject;
	private String officeLocation;
	
	
	
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName 
				+ ", subject=" + subject + ", officeLocation=" + officeLocation + "]";
	}

	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
}

public class PojoTrainer {

	public static void main(String[] args) {
		
		
	}

}
