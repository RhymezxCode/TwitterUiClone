precision mediump float;
uniform sampler2D uTexture;
varying vec2 vTexPos;
void main() {
    gl_FragColor = texture2D(uTexture, vTexPos);
}
