package academy.learnprogramming;

// Return a programmer-defined object.

public class Err {
    String msg; // error message
    int severity; // code indicating severity of error

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}

class ErrorInfo {
    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-Of-Bounds"
    };
    int howbad[] = { 3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err(" Invalid Error Code", 0);
    }
}
