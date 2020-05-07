#include<iostream>
int main(){
  int year;
  std::cin>>year;
  
  if(year % 4 == 0){ //first conditon
    if(year % 100 == 0){ //second condition
      if(year % 400 == 0){ //third condition
        std::cout<<"Vicky can celebrate his birthday.";
      } // end of third if condition
      else{
        std::cout<<"Vicky can't celebrate.";
      } // end of third else condition
    } //end of second if condition
    
    else{
      std::cout<<"Vicky can celebrate his birthday.";
    } // end of second else condition
  } //end of first if condition
  else{
    std::cout<<"Vicky can't celebrate.";
  }  // end of first else condition
}