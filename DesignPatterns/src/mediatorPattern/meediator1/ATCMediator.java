package mediatorPattern.meediator1;

public interface ATCMediator {
    public void sendMessage(String msg, AirCraft airCraft);
    void addAirCraft(AirCraft airCraft);
}
