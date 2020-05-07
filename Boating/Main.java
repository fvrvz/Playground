#include<iostream>
using namespace std;
int main()
{
  int t_weight, adult, child;
  std::cin>>t_weight>>adult>>child;
  
  int adult_w = 75;
  int child_w = 30;
  
  int t_adult_weight = adult_w * adult;
  int t_child_weight = child_w * child;
  
  int res = t_adult_weight + t_child_weight;
  
  if(res<=t_weight){
    std::cout<<"Boat is stable";
  }
  else{
    std::cout<<"Boat will drow";
  }
  
}