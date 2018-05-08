package com.company;


/*
this is the array list project. we are to create our own array list and submit it.
This arraylist uses Object[] so that we can store any values in it.
We prompt the user with how large they want their arraylist to be, and they have a choice to give it a size, or go with the default size i gave it which is 10
 */


public class ArrayList {


    //this is the fields to our class, int size to store the size, and myObj to hold the data
    int size;
    Object[] myObj;

    //Adds a new object to the array wherever it finds the first null value
    public void add(Object x){

        for(int val = 0; val < size; val++){
            if (myObj[val] == null){
                myObj[val] = x;
                break;
            }
        }
    }

//adds a new object in an index that we tell it. pushes the other existing values back one
    public void add(int index, Object x){

        for (int i =size-1; i>=index; i--){
            myObj[i] = myObj[i -1];

        }
        myObj[index] = x;

    }

//is given an index and returns the value at that index
    public Object get(int index){
        return myObj[index];
    }

//returns the size of the method
    public int size(){
        return size;
    }

//checks if myObj has any non-null values. returns true if it has all null values and returns false if it has any non-null values
    public boolean isEmpty(){
        for(Object x : myObj){
            if (!(x==null)){
                return false;
            }
        }
        return true;
    }


//is given an Object and returns true if the myObj contains the object and false if it doesnt contain the object
    public boolean isIn(Object ob){
        for(Object x : myObj){
            if (x==ob){
                return true;
            }
        }
        return false;
    }

//finds the index of the object.
    //is given the Object and searches myObj for any matching values and returns the index
    public int find(Object n){
        for (int x = 0; x < size; x++){
            if (myObj[x] == n){
                return x;           //returns the index of that object if it is found in the object array
            }
        }
        return Integer.MIN_VALUE;   //returns the smallest value of an integer possible if the object is not found
    }



//removes values from our arraylist
//is give an object and removes the first value it finds matching it
    public void remove(Object n){
        try {
            myObj[find(n)] = null;

        }catch (IndexOutOfBoundsException e){
            System.out.println("Object is not present in ArrayList");//prints this if the object is not found in the arraylist
        }

    }


    //constructor with no-parameters
    //sets the size of the arraylist to 10 and initializes the arraylist with the default size
    public ArrayList() {
        size = 10;
        myObj = new Object[size];
    }

    //constructor with one parameter. int size
    //asks the user for input on how large they want the arrraylist to be
    //sets the size to the size they wish and initializes the arraylist with that given size
    public ArrayList(int size){
        this.size = size;
        myObj = new Object[this.size];
    }

}
