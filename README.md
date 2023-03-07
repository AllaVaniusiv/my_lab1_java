I created a class according to my option 4.
 Using the lombok library, it implemented set and get methods, constructors with arguments, a constructor for soaking and an overridden method toString()
 The written class must contain a public static method getInstance(), and a field static field instance whose value will be returned by the method getInstance
 In the class, I also wrote the main method, in which I created an array of class objects using:
 - the default designer
 - a constructor that receives all parameters
 - 2 objects obtained when the getInstance method is called.  I created the Printer class, which has the following fields:
 model: printer model;
 type: printer type (ink or laser);
 isColor: whether the printer is color (true - if so, false - if not);
 isDuplex: whether the printer has the possibility of double-sided printing (true - if so, false - if not);
 paperTrayCapacity: the maximum number of sheets in the paper tray;
 paperCount: The current number of sheets of paper in the tray.
 The Printer class must have the following public methods:
 print(int pages): a method that prints the specified number of pages (implies subtraction from the number of sheets in the tray);
 loadPaper(int count): a method that adds the specified number of sheets of paper to the tray and provides a check for overflow of the tray, if the number of sheets after adding is greater than paperTrayCapacity, then paperCount should become equal to the maximum number of sheets.
