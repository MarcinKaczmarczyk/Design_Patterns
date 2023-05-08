package chainOfResponsibility;

import chainOfResponsibility.message.Message;
import chainOfResponsibility.officer.*;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Atakować!", 50, OfficerRank.CAPTAIN);

        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message);
    }
}
