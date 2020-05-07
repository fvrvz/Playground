#include <iostream>
int main(){
  int max, w;
  std::cin>>max>>w;
  
  if(max==w){
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else if(max>w){
    std::cout<<"Yes, you can enter.";
  }
  else{
    std::cout<<"Sorry, you can't enter";
  }
}