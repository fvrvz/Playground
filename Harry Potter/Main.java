#include<iostream>

int main(){
    
  int num;

  std::cin>>num;

  int last = num%10; //finding last digit

  num = (num / 1000) % 10; //finding first digit

  std::cout<<num+last; //adding and printing of both


}