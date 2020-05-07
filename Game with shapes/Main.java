#include<iostream>
using namespace std;
int main()
{
  int radius, length;
  std::cin>>radius>>length;
  
  int circle = radius*2;
  
  if(circle <= length){
    std::cout<<"circle can be inside a square";
  }
  else{
    std::cout<<"circle cannot be inside a square";
  }
}