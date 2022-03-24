package com.ioStudy.IO.recursion;

import java.io.File;

/**
 * 目标：去E盘搜索"结构体.md"
 */
public class RecursionDemo4 {
    public static void main(String[] args) {
        // 2. 传入目录 和 文件名
        searchFile(new File("E:/"), "结构体.md");
    }

    /**
     * 1. 搜索某个目录下的全部文件，找到我们想要的文件
     *
     * @param dir      被搜索的源文件
     * @param fileName 被搜索的文件名称
     */
    public static void searchFile(File dir, String fileName) {
        // 3. 判断dir是否是目录
        if (dir != null && dir.isDirectory()) {
            // 可以找了
            // 4. 可以遍历所有文件对象，然后寻找, 提取出一级对象
            File[] files = dir.listFiles(); // null []
            // 5. 是否存在一级文件目录
            if ((files != null && files.length > 0)) {
                for (File file : files) {
                    // 6. 判断当前遍历一级文件是对象还是文件还是目录
                    if (file.isFile()) {
                        // 7. 是不是目标，如果是把其路径输出即可
                        if (file.getName().contains(fileName)) {
                            System.out.println("找到了~~" + file.getAbsolutePath());
                        }
                    } else if (file.isDirectory()) {
                        // 8. 说明是文件夹
                        searchFile(file, fileName);
                    }
                }
            }

        } else {
            System.out.println("对不起，当前搜索的不是文件夹");
        }
    }
}
