#include <jni.h>
#include <string>

extern "C"
jstring
Java_de_schlender_carsten_alqu_Init_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
