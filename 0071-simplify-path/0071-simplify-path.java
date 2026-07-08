class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] folders = path.split("/");

        for (String folder : folders) {

            if (folder.equals("") || folder.equals(".")) {
                continue;
            }

            if (folder.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(folder);
            }
        }

        StringBuilder result = new StringBuilder();

        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}