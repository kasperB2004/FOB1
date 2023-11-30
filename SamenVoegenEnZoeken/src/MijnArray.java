public class MijnArray {
    private int[] array;
    public MijnArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public boolean isGesorteerd() {
       boolean isGesorteerd = true;
       int i = 0;
       while(i < array.length-1 && isGesorteerd)
       {
            if((array[i] > array[i+1])){
                isGesorteerd = false;
            }
            i++;
       }
       return isGesorteerd;
    }

    public String getDetail(){
        StringBuilder detail = new StringBuilder();
        detail.append((isGesorteerd())? "Gesorteerde array = " :  "Niet gesorteerde array = ");
        detail.append("[");
        detail.append(array[0]);
        for(int i =1;i<array.length;i++){
            detail.append(" ").append(array[i]);
        }
        detail.append("]");
        return detail.toString();
    }
    private int zoekNietGesorteerd(int zoekWaarde){
        int index = 0;
        int foundindex = -1;
        while(foundindex == -1 && index < array.length ){
            if(array[index] == zoekWaarde){
                foundindex = index;
            }
            index++;
        }
        return foundindex;
    }
    private int zoekGesorteerd(int zoekWaarde){
        int index = 0;
        int foundindex = -1;
        while(foundindex == -1 && index < array.length && zoekWaarde >= array[index]){
            if(array[index] == zoekWaarde){
                foundindex = index;
            }
            index++;
        }
        return foundindex;
    }

    public int zoek(int zoekwaarde){
        return (isGesorteerd()) ? zoekGesorteerd(zoekwaarde) : zoekNietGesorteerd(zoekwaarde);
    }

    private MijnArray samenvoegenNietGesorteerd(MijnArray andereArray){
        int[] tweedeArray = andereArray.getArray();
        int[] newArray = new int[array.length + tweedeArray.length];
        int indexniew = 0;
        for(int i = 0 ; i < array.length;indexniew ++ , i++){
            newArray[indexniew] = array[i];
        }
        for(int i = 0 ; i < tweedeArray.length;indexniew ++ , i++){
            newArray[indexniew] = tweedeArray[i];
        }
        return new MijnArray(newArray);

    }
    private MijnArray samenvoegenGesorteerd(MijnArray andereArray){
        int[] tweedeArray = andereArray.getArray();
        int[] newArray = new int[array.length + tweedeArray.length];
        int indexorgineel = 0;
        int indextweede = 0;

        for(int i = 0; i < newArray.length;i++)
        {
            if(indexorgineel < array.length && indextweede < tweedeArray.length){
                if(array[indexorgineel] <= tweedeArray[indextweede]){
                    newArray[i] = array[indexorgineel];
                    indexorgineel++;
                }else{
                    newArray[i] = tweedeArray[indextweede];
                    indextweede++;
                }
            }else if(indexorgineel == array.length){
                newArray[i] = tweedeArray[indextweede];
                indextweede++;
            }else{
                newArray[i] = array[indexorgineel];
                indexorgineel++;
            }

        }
        return new MijnArray(newArray);

    }
    public MijnArray samenvoegen(MijnArray andereArray){
        return (andereArray.isGesorteerd() && isGesorteerd()) ? samenvoegenGesorteerd(andereArray) : samenvoegenNietGesorteerd(andereArray);
    }
}
