#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int pet_l, dist;
  
  std::cin>>mileage>>pet_l>>dist;
  
  int mil = pet_l * mileage;
  
  if(dist > mil){
    std::cout<<"Cannot reach";
  }
  else{
    std::cout<<"Can reach";
  }
  
}