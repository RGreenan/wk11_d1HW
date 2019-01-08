public class WaterBottle {
    private long startVolume;
    private long currentVolume;

    public WaterBottle(long startVolume, long currentVolume){
        this.startVolume = startVolume;
        this.currentVolume = currentVolume;
    }

    public long newBottleVolume(){
        return this.startVolume;
    }

    //not dynamic, fix later if time permits..
    public long drinkVolume(){
        return this.startVolume -= 10;
    }

    public long emptyBottle(){
        return this.startVolume = 0;
    }

    public long fillBottle(){
        return this.currentVolume += this.startVolume;
    }

}
