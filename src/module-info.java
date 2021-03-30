module streams { {
}import java.util.ArrayList;
import java.util.List;  
class Product{  
    int zipcode;  
    String city;  
    String state;  
    public City( String name, ) {  
        this.zipcode = zipcode;  
        this.name = name;  
         
    }  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<State> stateList = new ArrayList<State>();  
        //Adding States
        StateList.add(new State(1,"Maharashtra",400028));  
        StateList.add(new State(2,"Manipur",30000));  
        StateList.add(new State(3,"Gujarat",28000));  
        StateList.add(new State(4,"Rajasthan",28000));  
        StateList.add(new State(5,"West Bengal",90000));  
        // count number of States based on the filter  
        long count = StatesList.stream()  
                    .filter(state->state.zipcode<30000)  
                    .count();  
        System.out.println(count);  
    }  
}
}