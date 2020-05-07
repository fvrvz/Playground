#include<iostream>
int main(){
  int birth, current;
 
  std::cin>>birth>>current;
  
  int fullBirth;
  int fullCurrent = current + 2000;
  
  if(birth > current){
    fullBirth = birth + 1900;
    std::cout<<fullCurrent - fullBirth;
  }
  else{
    fullBirth = birth + 2000;
    std::cout<<fullCurrent - fullBirth;
  }
}