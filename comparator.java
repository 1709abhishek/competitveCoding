Comparator<int[]> comparator = (a, b) -> Math.abs(a[0] - a[1]) - Math.abs(b[0] - b[1]);
Arrays.sort(costs,comparator);