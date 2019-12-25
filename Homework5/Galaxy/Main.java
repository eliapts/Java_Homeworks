import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task2();
//	task2();
    }
    
    public static void task2(){
        ArrayList<Star> star_array = new ArrayList<Star>();
        ArrayList<Planet> planet_array = new ArrayList<Planet>();
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter star/planet for create star/planet: ");
            String s = input.nextLine();
            if (s.equals("star")) {
                Star star = new Star();
                star.set_parameters();
                star.write_in_file();
                star_array.add(star);
            }else if (s.equals("planet")) {
                Planet planet = new Planet();
                planet.set_parameters();
                planet.write_in_file();
                planet_array.add(planet);
                for(int i=0; i < star_array.size(); i++){
                    if(star_array.get(i).name.equals(planet.star_name)){
                        planet.time = planet.get_time(star_array.get(i).diameter);
                        star_array.get(i).planet_list.add(planet);
                    }
                }
            }else break;
        }
        while (true) {
            System.out.print("Enter planet name, full galaxy or exit: ");
            String planet_name = input.nextLine();
            if(planet_name.equals("exit")){
                break;
            }
            if (planet_name.equals("full galaxy")){
                for(int s=0; s<star_array.size(); s++){
                    star_array.get(s).get_info();
                }
                for(int p=0; p<planet_array.size();p++){
                    planet_array.get(p).get_info();
                }
                break;
            }
            for(int i=0; i < planet_array.size(); i++) {
                if (planet_name.equals(planet_array.get(i).name)) {
                    planet_array.get(i).get_info();
                }
            }
        }
    }
}
