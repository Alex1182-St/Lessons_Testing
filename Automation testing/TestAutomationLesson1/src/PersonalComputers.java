public class PersonalComputers
{
    String nameOfProcessor;
    String nameOfOS;
    String nameOfVideoCard;
    int processorCoresQuantity;
    int processorFrequency;
    int memoryRAMVolume;
    int videoCardMemoryVolume;
    int powerOfPowerSupply;

    public PersonalComputers(String nameOfProcessor, String nameOfOS, String nameOfVideoCard, int processorCoresQuantity, int processorFrequency, int memoryRAMVolume, int videoCardMemoryVolume, int powerOfPowerSupply) {
        this.nameOfProcessor = nameOfProcessor;
        this.nameOfOS = nameOfOS;
        this.nameOfVideoCard = nameOfVideoCard;
        this.processorCoresQuantity = processorCoresQuantity;
        this.processorFrequency = processorFrequency;
        this.memoryRAMVolume = memoryRAMVolume;
        this.videoCardMemoryVolume = videoCardMemoryVolume;
        this.powerOfPowerSupply = powerOfPowerSupply;
    }

    public String getNameOfProcessor() {
        return nameOfProcessor;
    }

    public void setNameOfProcessor(String nameOfProcessor) {
        this.nameOfProcessor = nameOfProcessor;
    }

    public String getNameOfOS() {
        return nameOfOS;
    }

    public void setNameOfOS(String nameOfOS) {
        this.nameOfOS = nameOfOS;
    }

    public String getNameOfVideoCard() {
        return nameOfVideoCard;
    }

    public void setNameOfVideoCard(String nameOfVideoCard) {
        this.nameOfVideoCard = nameOfVideoCard;
    }

    public int getProcessorCoresQuantity() {
        return processorCoresQuantity;
    }

    public void setProcessorCoresQuantity(int processorCoresQuantity) {
        this.processorCoresQuantity = processorCoresQuantity;
    }

    public int getProcessorFrequency() {
        return processorFrequency;
    }

    public void setProcessorFrequency(int processorFrequency) {
        this.processorFrequency = processorFrequency;
    }

    public int getMemoryRAMVolume() {
        return memoryRAMVolume;
    }

    public void setMemoryRAMVolume(int memoryRAMVolume) {
        this.memoryRAMVolume = memoryRAMVolume;
    }

    public int getVideoCardMemoryVolume() {
        return videoCardMemoryVolume;
    }

    public void setVideoCardMemoryVolume(int videoCardMemoryVolume) {
        this.videoCardMemoryVolume = videoCardMemoryVolume;
    }

    public int getPowerOfPowerSupply() {
        return powerOfPowerSupply;
    }

    public void setPowerOfPowerSupply(int powerOfPowerSupply) {
        this.powerOfPowerSupply = powerOfPowerSupply;
    }

    public void startBIOSloading() {
    }

    public void startOSloading() {
    }

    public void startProgramExecution() {
    }

    public static void main(String[] args) {

    }
}
