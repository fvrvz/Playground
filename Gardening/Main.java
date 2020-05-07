#include<iostream>
using namespace std;
int main()
{
  int r, c, t;
  
  std::cin>>r>>c>>t;
  
  if(t > r && t <= c*2){
    std::cout <<"It is a mango tree";
  }
  else if(t <= r*c - c && t > r * (c-2)){
    std::cout<<"It is a mango tree";
  }
  else{
    std::cout<<"It is not a mango tree";
  }
}