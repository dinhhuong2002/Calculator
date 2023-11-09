#include <jni.h>
#include <string.h>
#include <android/log.h>
#include <malloc.h>

#define DEBUG_TAG "NDK_AndroidNDK1SampleActivity"

void
Java_com_example_mylibrary_CalculatorModule_helloLog(
        JNIEnv *env,
        jobject this,
        jstring logThis) {
        jboolean isCopy;
    const char *szLogThis = (*env)->GetStringUTFChars(env, logThis, &isCopy);
    __android_log_print(ANDROID_LOG_DEBUG, DEBUG_TAG, "NDK:LC: [%s]", szLogThis);
    (*env)->ReleaseStringUTFChars(env, logThis, szLogThis);
}

JNIEXPORT double JNICALL
Java_com_example_mylibrary_CalculatorModule_add(JNIEnv *env, jobject thiz, jdouble a, jdouble b) {
    // TODO: implement add()
    double result=a+b;
    char* resultString=(char *)malloc(50);
    sprintf (resultString,"%f\n", result) ;

    //hehhe
    __android_log_print(ANDROID_LOG_DEBUG, DEBUG_TAG, "%f\n", resultString);
    return a + b;

}

JNIEXPORT jdouble JNICALL
Java_com_example_mylibrary_CalculatorModule_sub(JNIEnv *env, jobject thiz, jdouble a, jdouble b) {
    // TODO: implement sub()
//    double result=a-b;
//    char* resultString=(char *)malloc(50);
//    sprintf (resultString,"%f\n", result) ;
    __android_log_print(ANDROID_LOG_DEBUG, DEBUG_TAG, "%s\n", "subtraction");
    return a - b;
}

JNIEXPORT jdouble JNICALL
Java_com_example_mylibrary_CalculatorModule_mul(JNIEnv *env, jobject thiz, jdouble a, jdouble b) {
    // TODO: implement mul()
    return a * b;
}

JNIEXPORT jdouble JNICALL
Java_com_example_mylibrary_CalculatorModule_divide(JNIEnv *env, jobject thiz, jdouble a,
                                                   jdouble b) {
    // TODO: implement divide()
    return a / b;
}