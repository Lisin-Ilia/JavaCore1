package HW3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T>boxes = new ArrayList();

    public Box() {

    }

    public void addFruitToBox(T fruit){  /* Метод добавления фрукта в коробку */
        boxes.add(fruit);
    }   /* Метод добавления фрукта в коробку */

    public float getWeight(){
        float weight = 0.0f;
        for(int i = 0; i < boxes.size();i++){
            weight = weight + boxes.get(i).getWeight();
        }
        return 1 * boxes.size();
    }

    public boolean compare(Box<?> box){             /* Метод сравнения коробок по весу */
        if(this.getWeight() == box.getWeight()){
            return true;
        }else{
            return false;
        }
    }

//    public void clearFruitBox(){        /* Метод отчистки ящика */
//        this.boxes.clear();
//    }

    public void shiftFruitToBox(Box<T> anotherBox){ /* Метод пересыпания из полной коробки в пустую */
        anotherBox.boxes.addAll(this.boxes);
        this.boxes.clear();
    }

}

