package Array_Data_Structure;
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Dynamic_Array {
   int[] arr;
   int capacity;
   int size;

   Dynamic_Array(int var1) {
      this.capacity = var1;
      this.arr = new int[var1];
      this.size = 0;
   }

   boolean insert(int var1, int var2) {
      if (var1 >= 0 && var1 <= this.size) {
         if (this.size >= this.capacity) {
            this.resize();
         }

         for(int var3 = this.size; var3 > var1; --var3) {
            this.arr[var3] = this.arr[var3 - 1];
         }

         this.arr[var1] = var2;
         ++this.size;
         return true;
      } else {
         return false;
      }
   }

   void display() {
      for(int var1 = 0; var1 < this.size; ++var1) {
         System.out.println(this.arr[var1]);
      }

   }

   int get(int var1) {
      return this.size > var1 && var1 >= 0 ? this.arr[var1] : -1;
   }

   void set(int var1, int var2) {
      if (var1 >= 0 && var1 < this.size) {
         this.arr[var1] = var2;
      }
   }

   int search(int var1) {
      for(int var2 = 0; var2 < this.size; ++var2) {
         if (this.arr[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   boolean delete(int var1) {
      if (var1 >= 0 && var1 < this.size) {
         for(int var2 = var1; var2 < this.size - 1; ++var2) {
            this.arr[var2] = this.arr[var2 + 1];
         }

         --this.size;
         return true;
      } else {
         return false;
      }
   }

   void resize() {
      this.capacity = 2 * this.capacity;
      int[] var1 = new int[this.capacity];

      for(int var2 = 0; var2 < this.size; ++var2) {
         var1[var2] = this.arr[var2];
      }

      this.arr = var1;
   }

   public static void main(String[] var0) {
      Dynamic_Array var1 = new Dynamic_Array(5);
      var1.insert(0, 1);
      var1.insert(1, 2);
      var1.insert(2, 3);
      var1.insert(3, 4);
      var1.set(3, 5);
      var1.insert(4, 6);
      var1.insert(5, 7);
      var1.display();
      System.out.println("index element  " + var1.get(3));
   }
}

