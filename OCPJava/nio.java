//chapter 14


public static void nio1() throws IOException {
      var path = Path.of("C:\\data\\zoo.txt");
      if (Files.exists(path)) {
              System.out.println("Absolute Path: " + path.toAbsolutePath());
              System.out.println("Is Directory: " + Files.isDirectory(path));
             System.out.println("Parent Path: " + path.getParent());
               if (Files.isRegularFile(path)) {
                     System.out.println("Size: " + Files.size(path));


                   System.out.println("Last Modified: "
                                 + Files.getLastModifiedTime(path));
                        } else {

                   try (Stream<Path> stream = Files.list(path)) {
                                 stream.forEach(p - >
                                             System.out.println("   " + p.getName()));
                              } } } }