public class ZombiePlant {
    private final int potency;
    private int treatments;

    public ZombiePlant(int potency, int treatments){
        this.potency = potency;
        this.treatments = treatments;
    }

    public int getPotency(){
        return this.potency;
    }

    public int treatmentsNeeded(){
        return this.treatments;
    }

    public boolean isDangerous(){
        if(treatments>0){
            return true;
        }
        else{
            return false;
        }
    }

    public void treat(int treatValue){
        if (treatments>0) {
            if((treatValue>0) && treatValue=<potency){
                treatments--;
            }
            else if (treatValue>0){
                treatments++;
            }
        }
        else if(treatValue>potency) {
            treatments++;
        }
    }
}
