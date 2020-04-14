import product;
public class chocolate implements product
{
  public int getprice(int pr)
  {
    if(pr==1)
     return (50);
    else 
     return(pr*50);
  }
  
  public String getmaker()
  {
    return(maker);
  }
}
