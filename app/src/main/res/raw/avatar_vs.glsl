uniform mat4 uScreen;
attribute vec2 aPosition;
attribute vec2 aTexPos;
varying vec2 vTexPos;
void main() {
    vTexPos = aTexPos;
    gl_Position = uScreen * vec4(aPosition.xy, 0.0, 1.0);
}
