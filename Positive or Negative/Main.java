#include<iostream>
int main(){
  int num;
  
  std::cin>>num;
  
  if(num<0){
    std::cout<<num<<" is a negative number.";
  }
  else{
    std::cout<<num<<" is a positive number.";
  }
}