public class son2D {
    public static void main(String[] args) {
        int n1 = 456;
        int n2 = 4;
        int sum = addNum(n1,n2);

        int[][] nums0 = {
                {0,1,1,1,0}, // 0
                {0,1,0,1,0},
                {0,1,0,1,0},
                {0,1,0,1,0},
                {0,1,1,1,0}

        };
        int[][] nums1 = {
                {0,0,0,1,0}, // 1
                {0,0,0,1,0},
                {0,0,0,1,0},
                {0,0,0,1,0},
                {0,0,0,1,0}

        };
        int[][] nums2 = {
                {0,1,1,1,0}, // 2
                {0,0,0,1,0},
                {0,1,1,1,0},
                {0,1,0,0,0},
                {0,1,1,1,0}

        };
        int[][] nums3 = {
                {0,1,1,1,0}, // 3
                {0,0,0,1,0},
                {0,1,1,1,0},
                {0,0,0,1,0},
                {0,1,1,1,0}

        };
        int[][] nums4 = {
                {0,1,0,1,0}, // 4
                {0,1,0,1,0},
                {0,1,1,1,0},
                {0,0,0,1,0},
                {0,0,0,1,0}

        };
        int[][] nums5 = {
                {0,1,1,1,0}, // 5
                {0,1,0,0,0},
                {0,1,1,1,0},
                {0,0,0,1,0},
                {0,1,1,1,0}

        };
        int[][] nums6 = {
                {0,1,1,1,0}, // 6
                {0,1,0,0,0},
                {0,1,1,1,0},
                {0,1,0,1,0},
                {0,1,1,1,0}

        };
        int[][] nums7 = {
                {0,1,1,1,0}, // 7
                {0,0,0,1,0},
                {0,0,0,1,0},
                {0,0,0,1,0},
                {0,0,0,1,0}

        };
        int[][] nums8 = {
                {0,1,1,1,0}, // 8
                {0,1,0,1,0},
                {0,1,1,1,0},
                {0,1,0,1,0},
                {0,1,1,1,0}

        };
        int[][] nums9 = {
                {0,1,1,1,0}, // 9
                {0,1,0,1,0},
                {0,1,1,1,0},
                {0,0,0,1,0},
                {0,1,1,1,0}

        };

        int[][][] numbers = {nums0,
                             nums1,
                             nums2,
                             nums3,
                             nums4,
                             nums5,
                             nums6,
                             nums7,
                             nums8,
                             nums9
                            };


            for (int i = 0; i < (sum + "").length(); i++) {
                int N = Integer.parseInt(String.valueOf((sum+"").charAt(i)));
//                System.out.println(N);
                //            for (int i = 0; i < numbers.length; i++) {

                for (int j = 0; j < numbers[N].length; j++) {
                    for (int k = 0; k < numbers[N][j].length; k++) {
                        if(numbers[N][j][k] == 0){
                            System.out.print("  ");
                        }else System.out.print("o ");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println();
//            }
            }


//        switch (n){
//            case 0 :
//                for (int[] ints : nums0) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 1 :
//                for (int[] ints : nums1) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 2 :
//                for (int[] ints : nums2) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 3 :
//                for (int[] ints : nums3) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 4 :
//                for (int[] ints : nums4) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 5 :
//                for (int[] ints : nums5) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 6 :
//                for (int[] ints : nums6) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//            case  7 :
//                for (int[] ints : nums7) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 8 :
//                for (int[] ints : nums8) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//            case 9 :
//                for (int[] ints : nums9) {
//                    for (int anInt : ints) {
//                        if (anInt == 0) {
//                            System.out.print("_ ");
//                        } else System.out.print("0 ");
//                    }
//                    System.out.println();
//                }
//                break;
//
//        }
//        System.out.print(Arrays.deepToString(numbers));

    }

    public static int  addNum(int n1, int n2){
        return n1 + n2;
    }
    public static int  ayirNum(int n1, int n2){
        return n1 - n2;
    }
    public static int  kopNum(int n1, int n2){
        return n1 * n2;
    }
    public static int  bolNum(int n1, int n2){
        return n1 + n2;
    }

}
