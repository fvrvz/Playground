#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int n_Items;
  float heatingTime;
  
  std::cin>>n_Items>>heatingTime;
  
  float totalHeatingTime;
  
  if(n_Items == 2){
  		totalHeatingTime = (heatingTime/2) + heatingTime;
  		std::cout<<fixed<<setprecision(2)<<totalHeatingTime;
  }
  else if(n_Items == 3){   
  		totalHeatingTime = heatingTime * 2;
  		std::cout<<fixed<<setprecision(2)<<totalHeatingTime;
  }
  else{
    std::cout<<"Number of items is more";
  }
}