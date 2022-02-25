#extension GL_OES_EGL_image_external : require
precision highp float;

const float kInvPi = (1.0 / 3.14159265358);
const float kInv2Pi = (0.5 / 3.14159265358);

vec2 projectEquirectangular(vec3 nrmDir) {
  return vec2(0.5 + atan(nrmDir.x, nrmDir.z) * kInv2Pi, 0.5 - asin(nrmDir.y) * kInvPi);
}

varying vec3 fs_RayDir;

uniform samplerExternalOES texture;

void main() {
  vec2 texCoord = projectEquirectangular(normalize(fs_RayDir));
  vec3 rgb = texture2D(texture, texCoord).xyz;
  gl_FragColor = vec4(rgb, 1.0);
}
