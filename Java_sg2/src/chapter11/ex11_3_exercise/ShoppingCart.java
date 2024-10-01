package chapter11.ex11_3_exercise;


//
//In the ShoppingCart class:
//        1.  Code the displayTotal method.  Use a standard for loop to
//iterate through the items array.
//2.  If the current item is out of stock (call isOutOfStock method of
//        the item), skip to the next loop iteration.
//        3.  If it is not out of stock, add the item price to a total variable
//that you declare and initialize prior to the for loop.
//4.  Print the Shopping Cart total with a suitable label.

public class ShoppingCart {


        Item[] items = {new Item("Shirt",25.60),
                new Item("WristBand",1.00),
                new Item("Pants",35.99)};

        public static void main(String[] args){
            ShoppingCart cart = new ShoppingCart();
            cart.displayTotal();
        }

        public void displayTotal(){
            double total = 0;
            for(int idx = 0; idx < items.length; idx++){
                if(items[idx].isBackOrdered())
                    continue;
                total += items[idx].getPrice();
            }
            System.out.println("Shopping Cart total: "+total);
        }
    }


