//Your cell phone rings. Return true if you should answer it. 
//Normally you answer, except in the morning you only answer if it is your friend calling. 
//In all cases, if you are asleep, you do not answer.


public boolean answerCall(boolean morning, boolean isFriend, boolean asleep) {
    if (asleep = true){
        return false;
    }
    else if (morning = false && asleep = false){
        return true;
    }
    else if ((morning = true && isFriend = true)){
        return true;
    }
    return false;
}
