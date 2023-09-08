class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> asteroid = new Stack<>();
        boolean flag = false;
        for(int i : asteroids){
            if(asteroid.empty() || i*asteroid.peek() > 0){
                asteroid.push(i);
                continue;
            }
            while(!asteroid.empty() && i*asteroid.peek() < 0){
                if(i > 0 && asteroid.peek() < 0){
                    flag = true;
                    break;
                }else if(i < 0 && asteroid.peek() > 0 && -1 * i > asteroid.peek()){
                    asteroid.pop();
                    flag = true;
                }else if( -1*i == asteroid.peek()){
                    asteroid.pop();
                    flag = false;
                    break;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                asteroid.push(i);
            }
        }
        int[] result = new int[asteroid.size()];
        int i = asteroid.size()-1;
        while(!asteroid.empty()){
            result[i] = asteroid.pop();
            i--;
        }
        return result;
    }
}