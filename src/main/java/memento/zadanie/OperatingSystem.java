package memento.zadanie;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber;
    private Date backupDate;

    public void createBackup(){
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Utworzono backup nr: " + this.backupNumber + " z datą: " + backupDate);
    }
    public OperatingSystemMemento save(){
        System.out.println("Zapisano backup nr: " + this.backupNumber + " z datą: " + this.backupDate);
        return new OperatingSystemMemento(this.backupNumber,this.backupDate);
    }
    public void load(OperatingSystemMemento memento){
        this.backupNumber=memento.getBackupNumber();
        this.backupDate=memento.getBackupDate();
        System.out.println("Wczytano backup nr: " + this.backupNumber + " z datą: " + this.backupDate);
    }


}
