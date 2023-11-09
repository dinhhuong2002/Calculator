//
// Created by admin on 11/9/2023.
//
#include <jni.h>
#include <string>
#include <android/log.h>
#define DEBUG_TAG "CMAKE HIHI"

extern "C"
JNIEXPORT jdouble JNICALL
Java_com_example_mylibrary_CalculatorModule_addCmake(
        JNIEnv *env,
        jobject thiz,
        double a,
        jdouble b) {
    // TODO: implement addCmake()
    __android_log_print(ANDROID_LOG_DEBUG, DEBUG_TAG, "NDK:LC: [%s]", "addMethod");
    return a+b;
}
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_example_mylibrary_CalculatorModule_subCmake(JNIEnv *env, jobject thiz, jdouble a,
                                                     jdouble b) {
    // TODO: implement subCmake()
    __android_log_print(ANDROID_LOG_DEBUG, DEBUG_TAG, "NDK:LC: [%s]", "subMethod");
    return a-b;
}
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_example_mylibrary_CalculatorModule_mulCmake(JNIEnv *env, jobject thiz, jdouble a,
                                                     jdouble b) {
    // TODO: implement mulCmake()
    __android_log_print(ANDROID_LOG_DEBUG, DEBUG_TAG, "NDK:LC: [%s]", "mulMethod");
    return a*b;
}
extern "C"
JNIEXPORT jdouble JNICALL
Java_com_example_mylibrary_CalculatorModule_divideCmake(JNIEnv *env, jobject thiz, jdouble a,
                                                        jdouble b) {
    // TODO: implement divideCmake()
    __android_log_print(ANDROID_LOG_DEBUG, DEBUG_TAG, "NDK:LC: [%s]", "divideMethod");
    return a/b;
}