#include<iostream>
using namespace std;
int main()
{
  int row, col, tree;
  std::cin>>row>>col>>tree;
  
  if(row > 2){
    if(tree <= col){
      std::cout<<"Yes";
    }
    else if(tree <= (row*col) && tree > ((row*col) - col)) {
      std::cout<<"Yes";
    }
    else if(tree == (row+1) || tree == ((row*2)+1) || tree == ((row*3)+1)){
      std::cout<<"Yes";
    }
    else{
      std::cout<<"No";
    }
  }
  else{
    if(tree <= 2){
      std::cout<<"Yes";
    }
    else if(tree == row*col || tree == ((row*col) - 1)){
      std::cout<<"Yes";
    }
    else if(tree == (row+1) || tree == ((row*2)+1) || tree == ((row*3)+1)){
      std::cout<<"Yes";
    }
    else if(tree % 2 == 0 && tree != 2){
      std::cout<<"No";
    }
    else{
      std::cout<<"No";
    }
  }
}